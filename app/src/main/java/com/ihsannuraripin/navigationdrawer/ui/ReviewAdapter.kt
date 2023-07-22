package com.ihsannuraripin.navigationdrawer.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ihsannuraripin.navigationdrawer.data.response.CustomerReviewsItem
import com.ihsannuraripin.navigationdrawer.databinding.ItemReviewBinding

class ReviewAdapter : ListAdapter <CustomerReviewsItem,ReviewAdapter.MyViewHolder> (DIFF_CALLBACK){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindng = ItemReviewBinding.inflate(LayoutInflater.from(parent.context),parent
        , false)
        return MyViewHolder(bindng)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val review = getItem(position)
        holder.bind(review)
    }

    class MyViewHolder (val binding: ItemReviewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (review : CustomerReviewsItem) {
            binding.tvItem
        }
    }


    companion object {
        val DIFF_CALLBACK = object  : DiffUtil.ItemCallback<ItemReviewBinding> (){
            override fun areItemsTheSame(
                oldItem: ItemReviewBinding,
                newItem: ItemReviewBinding
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: ItemReviewBinding,
                newItem: ItemReviewBinding
            ): Boolean {
                return  oldItem == newItem
            }

        }
    }

}