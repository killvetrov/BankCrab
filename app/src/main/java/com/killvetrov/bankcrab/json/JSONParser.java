package com.killvetrov.bankcrab.json;

import com.killvetrov.bankcrab.models.OrganizationModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Killvetrov on 27-Oct-15.
 */
public class JSONParser {

    public static ArrayList<OrganizationModel> parseOrganizationList(String entity) {
        ArrayList<OrganizationModel> models = new ArrayList<>();

        try {
            JSONObject jsonObjectResponse = new JSONObject(entity);
            JSONArray jsonOrgsArray = jsonObjectResponse.getJSONArray("organizations");
            for (int i = 0; i < jsonOrgsArray.length(); i++) {
                models.add(new OrganizationModel(0, null, 0, jsonOrgsArray.getJSONObject(i).optString("title"), null, null, null, null, null));
            }
            return models;
        } catch (JSONException e) {
            e.printStackTrace();
            return models;
        }

    }

}
