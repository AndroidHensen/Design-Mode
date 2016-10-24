package com.handsome.designmode.MVP.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.R;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/24.
 */
public class StudentAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Student> list;

    public StudentAdapter(Context context, List<Student> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.adapter_student, null);
        }
        ViewHolder viewHolder = getViewHolder(convertView);
        viewHolder.iv.setBackgroundResource(list.get(position).getImage());
        viewHolder.tv.setText(list.get(position).getName());
        return convertView;
    }

    private ViewHolder getViewHolder(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        return viewHolder;
    }

    private class ViewHolder {
        private TextView tv;
        private ImageView iv;

        private ViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.tv);
            iv = (ImageView) view.findViewById(R.id.iv);
        }
    }


}
