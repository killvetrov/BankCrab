package com.killvetrov.bankcrab.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.killvetrov.bankcrab.R;
import com.killvetrov.bankcrab.adapters.BankListAdapter;
import com.killvetrov.bankcrab.json.JSONParser;
import com.killvetrov.bankcrab.models.OrganizationModel;

import org.apache.http.HttpResponse;

import java.util.ArrayList;

import ua.com.oncreate.tools.http.Net;
import ua.com.oncreate.tools.interfaces.ConnectionListener;
import ua.com.oncreate.tools.models.ConnectInfo;

public class MainActivity extends AppCompatActivity implements ConnectionListener {

    RecyclerView mRecyclerView;
    BankListAdapter mBankListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBankListAdapter = new BankListAdapter(new ArrayList<OrganizationModel>());

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mBankListAdapter);

        Net net = new Net(this);
        net.setMethod(Net.GET);
        net.setURL("http://resources.finance.ua/ru/public/currency-cash.json");
        net.connect(this);
    }

    @Override
    public void onStartConnection(String requestUrl) {

    }

    @Override
    public void onFinishConnection(ConnectInfo info, HttpResponse response, String entity) {
        mBankListAdapter.clear();
        mBankListAdapter.addAll(JSONParser.parseOrganizationList(entity));
        mBankListAdapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this, "All done", Toast.LENGTH_SHORT).show();
    }
}
