package com.killvetrov.bankcrab.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.killvetrov.bankcrab.R;
import com.killvetrov.bankcrab.models.OrganizationModel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Killvetrov on 27-Oct-15.
 */
public class BankListAdapter extends RecyclerView.Adapter<BankListAdapter.ViewHolder> {

    private ArrayList<OrganizationModel> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvBankTitle;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            tvBankTitle = (TextView) v.findViewById(R.id.tv_bank_title);
        }

        public TextView getBankTitleTextView() {
            return tvBankTitle;
        }
    }

    public boolean addAll(Collection<? extends OrganizationModel> collection) {
        return mDataSet.addAll(collection);
    }

    public boolean add(OrganizationModel object) {
        return mDataSet.add(object);
    }

    public void clear() {
        mDataSet.clear();
    }

    public BankListAdapter(ArrayList<OrganizationModel> initDataSet) {
        this.mDataSet = initDataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bank_list_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBankTitleTextView().setText(mDataSet.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }


}
