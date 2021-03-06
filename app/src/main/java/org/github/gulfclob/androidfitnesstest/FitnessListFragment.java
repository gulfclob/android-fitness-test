package org.github.gulfclob.androidfitnesstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FitnessListFragment extends ListFragment {
    private static final String TAG = "FitnessListFragment";
    private static final String[] LIST_ITEMS = { "One-Rep Max Calc",
            "TDEE Calc", "Strength Standards", "Routines" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(getActivity()
                .getApplicationContext(), R.layout.list_item, R.id.listTextView, LIST_ITEMS);
        setListAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.i(TAG, "List Item Click detected");
        Intent i;
        switch (position) {
            case 0:
                i = new Intent(getActivity(), OneRmActivity.class);
                break;
            case 1:
                i = new Intent(getActivity(), TdeeCalcActivity.class);
                break;
            case 2:
                i = new Intent(getActivity(), StrStdActivity.class);
                break;
            case 3:
                i = new Intent(getActivity(), RoutineListActivity.class);
                break;
            default:
                return;
        }
        startActivity(i);
        Log.i(TAG, "Starting new activity");
    }

}
