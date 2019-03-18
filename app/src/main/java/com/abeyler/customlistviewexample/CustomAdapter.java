package com.abeyler.customlistviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<User> {

    private Context context;

    public CustomAdapter(Context context, List<User> users) {
        super(context, R.layout.row_item, users);
        this.context = context;
    }


    private static class ViewHolder {
        TextView userNameTxt;
        ImageView userImage;
        Button showBttn;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final User user = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.userNameTxt = convertView.findViewById(R.id.userName);
            viewHolder.userImage = convertView.findViewById(R.id.userIcom);
            viewHolder.showBttn = convertView.findViewById(R.id.showBttn);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String str = user.getName() + " " + user.getSurname();

        viewHolder.userNameTxt.setText(str);

        if (user.isFemale()) {
            viewHolder.userImage.setImageResource(R.drawable.female_icon);
        } else {
            viewHolder.userImage.setImageResource(R.drawable.male_icon);
        }

        viewHolder.showBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });


        return convertView;
    }
}
