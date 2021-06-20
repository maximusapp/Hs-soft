package com.example.hssoft.presentation.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hssoft.R
import com.example.hssoft.domain.entity.UserDataEntity

class UsersListAdapter(private val items: ArrayList<UserDataEntity>) : RecyclerView.Adapter<UsersListAdapter.Holder>() {

    private var listeners: Listeners? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val viewWeatherMain = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return Holder(viewWeatherMain)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        with(holder) {
            Glide.with(imgUserAvatar)
                    .load(items[position].picture?.medium).into(imgUserAvatar)
            tvUserName.text = items[position].name?.first
            tvUserAge.text = items[position].registered?.age.toString()

            containerUser.setOnClickListener { listeners?.onUserClicked(items[position]) }
        }
    }

    override fun getItemCount(): Int {
         return items.size ?: 0
    }

    fun setListener(listeners: Listeners) {
        this.listeners = listeners
    }

    interface Listeners {
        fun onUserClicked(userDataEntity: UserDataEntity)
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var containerUser: ConstraintLayout = itemView.findViewById(R.id.containerUser)
        var imgUserAvatar: ImageView = itemView.findViewById(R.id.imgUserAvatar)
        var tvUserName: TextView = itemView.findViewById(R.id.tvUserName)
        var tvUserAge: TextView = itemView.findViewById(R.id.tvUserAge)
    }
}