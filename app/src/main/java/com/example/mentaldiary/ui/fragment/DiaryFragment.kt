package com.example.mentaldiary.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mentaldiary.R
import com.example.mentaldiary.ui.viewModels.DiaryViewModel

class DiaryFragment : Fragment() {

    companion object {
        fun newInstance() = DiaryFragment()
    }

    private lateinit var viewModel: DiaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_diary, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DiaryViewModel::class.java)
        // TODO: Use the ViewModel
    }

    fun saveOn(view: View) {}

}