package com.handsome.designmode.MVC.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.handsome.designmode.MVC.Bean.Book;
import com.handsome.designmode.R;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/24.
 */
public class BookAdapter extends BaseAdapter {

    private List<Book> list;
    private LayoutInflater mInflater;

    public BookAdapter(Context context, List<Book> list) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
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
            convertView = mInflater.inflate(R.layout.adapter_book, null);
        }
        final ViewHolder holder = getViewHolder(convertView);
        Book book = list.get(position);
        holder.tv_name.setText(book.getName());
        holder.iv_image.setBackgroundResource(book.getImage());
        return convertView;
    }

    /**
     * 获得控件管理对象
     *
     * @param view
     * @return
     */
    private ViewHolder getViewHolder(View view) {
        ViewHolder holder = (ViewHolder) view.getTag();
        if (holder == null) {
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        return holder;
    }

    /**
     * 控件管理类
     */
    private class ViewHolder {

        private TextView tv_name;
        private ImageView iv_image;

        ViewHolder(View view) {
            tv_name = (TextView) view.findViewById(R.id.tv);
            iv_image = (ImageView) view.findViewById(R.id.iv);
        }
    }

}
