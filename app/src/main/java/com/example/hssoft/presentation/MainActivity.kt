package com.example.hssoft.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.hssoft.R
import com.example.hssoft.domain.entity.AllUsersEntity
import com.example.hssoft.domain.entity.UserDataEntity
import com.example.hssoft.network.observe
import com.example.hssoft.presentation.fragments.DetailsFragment
import com.example.hssoft.presentation.fragments.ListFragment
import com.example.hssoft.presentation.utils.supportFragmentTransaction
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), ListNavigationController {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
    }

    override fun listItemClicked(userData: UserDataEntity) {
        launchDetailsFragment(DetailsFragment.create(userData))
    }

    private fun launchDetailsFragment(fragment: Fragment) {
        supportFragmentTransaction {
            replace(fragment_details.id, fragment)
        }
    }

    private fun launchListFragment(fragment: Fragment) {
        supportFragmentTransaction {
            replace(fragment_list.id, fragment)
        }
    }

    private fun initViewModel() {
        with(viewModel) {
            observe(allUsersUpdate()) { allUsersData ->
                sendDataToListFragment(allUsersData)
            }
        }
    }

    private fun sendDataToListFragment(allUsersData: AllUsersEntity?) {
        launchListFragment(ListFragment.create(allUsersData))
    }

}