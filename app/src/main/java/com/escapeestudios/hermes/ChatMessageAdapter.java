//package com.escapeestudios.hermes;
//
//import android.app.Activity;
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.bumptech.glide.Glide;
//
//import java.util.List;
//
//
///**
// * Created by SUYASH KUMAR on 2/18/2017.
// */
//
//public class ChatMessageAdapter extends ArrayAdapter<ChatMessage> {
//    public ChatMessageAdapter(Context context, int resource, List<ChatMessage> objects) {
//        super(context, resource, objects);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.single_message, parent, false);
//        }
//
//        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.sent_imageView2);
//        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
//        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);
//
//        FriendlyMessage message = getItem(position);
//
//        boolean isPhoto = message.getPhotoUrl() != null;
//        if (isPhoto) {
//            messageTextView.setVisibility(View.GONE);
//            photoImageView.setVisibility(View.VISIBLE);
//            Glide.with(photoImageView.getContext())
//                    .load(message.getPhotoUrl())
//                    .into(photoImageView);
//        } else {
//            messageTextView.setVisibility(View.VISIBLE);
//            photoImageView.setVisibility(View.GONE);
//            messageTextView.setText(message.getText());
//        }
//        authorTextView.setText(message.getName());
//
//        return convertView;
//    }
//}
