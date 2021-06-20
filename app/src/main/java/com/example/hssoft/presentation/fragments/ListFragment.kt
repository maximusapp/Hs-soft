package com.example.hssoft.presentation.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hssoft.R
import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.domain.entity.UserDataEntity
import com.example.hssoft.presentation.ListNavigationController
import com.example.hssoft.presentation.base.BaseFragment
import com.example.hssoft.presentation.fragments.adapter.UsersListAdapter
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : BaseFragment() {
    override val layoutRes: Int = R.layout.fragment_list

    private val args by lazy { arguments?.getSerializable(EXTRA_USERS_DATA) as? AllUsersEntity }
    private var usersAdapter: UsersListAdapter? = null
    fun listNavigationController() = activity as? ListNavigationController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRecycler()
        intClickListeners()
    }

    private fun initRecycler() {
        usersAdapter = args?.results?.let { UsersListAdapter(it) }
        with(rvUserList) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = usersAdapter
        }
    }

    private fun intClickListeners() {
        usersAdapter?.setListener(object : UsersListAdapter.Listeners {
            override fun onUserClicked(userDataEntity: UserDataEntity) {
                listNavigationController()?.listItemClicked(userDataEntity)
            }
        })
    }

    companion object {
        private const val EXTRA_USERS_DATA = "extra_users"

        fun create(allUsersData: AllUsersEntity? = null) = ListFragment().apply {
            allUsersData?.let { users ->
                arguments = Bundle().apply {
                    putSerializable(EXTRA_USERS_DATA, users)
                }
            }
        }
    }

}