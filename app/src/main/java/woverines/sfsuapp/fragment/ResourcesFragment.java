package woverines.sfsuapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import woverines.sfsuapp.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class ResourcesFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String ARG_TEXT = "text";

    public ResourcesFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ResourcesFragment newInstance(int sectionNumber, String text) {

        ResourcesFragment fragment = new ResourcesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_resources, container, false);
        Bundle args = getArguments();
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(args.getString(ARG_TEXT));

        TextView official = (TextView) rootView.findViewById(R.id.official_site);
        Linkify.addLinks(official, Linkify.WEB_URLS);
//        official.setLinkTextColor();

        return rootView;
    }
}