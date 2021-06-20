package com.example.hssoft.presentation.fragments

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.hssoft.R
import com.example.hssoft.domain.entity.UserDataEntity
import com.example.hssoft.presentation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : BaseFragment() {
    override val layoutRes: Int = R.layout.fragment_details

    private val args by lazy { arguments?.getSerializable(EXTRA_USER_DATA) as? UserDataEntity }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupUserDetails()
    }

    private fun setupUserDetails() {
        Glide.with(imgUserDetail).load(args?.picture?.medium).into(imgUserDetail)
        tvDetailsUserName.text = args?.name?.first
        tvDetailsUserAge.text = args?.dob?.age.toString()
    }

    companion object {
        private const val EXTRA_USER_DATA = "extra_user"

        fun create(usersData: UserDataEntity? = null) = DetailsFragment().apply {
            usersData?.let { user ->
                arguments = Bundle().apply {
                    putSerializable(EXTRA_USER_DATA, user)
                }
            }
        }

    }

}