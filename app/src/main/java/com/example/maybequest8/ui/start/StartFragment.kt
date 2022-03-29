package com.example.maybequest8.ui.start

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.maybequest8.R
import com.example.maybequest8.databinding.StartFragmentBinding
import com.example.maybequest8.services.Route
import com.example.maybequest8.viewModels.ViewModel

import android.app.Service;

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this)[ViewModel::class.java]
        val binding = StartFragmentBinding.inflate(inflater, container, false)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.town,
        android.R.layout.simple_spinner_item
        ).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = arrayAdapter
        }

        binding.button.setOnClickListener {
            viewModel.setCity(binding.spinner.selectedItem.toString())

            /*построение маршрута запустить сервис и пусть мне он его создаст в фоне*/
            //TODO сделать проврки на ввод
            val intent = Intent(requireContext(), Route::class.java)
            intent.putExtra("quantityCities", binding.editText.text)
            requireContext().startService(intent)
            findNavController().navigate(R.id.action_startFragment_to_navigation_home)
        }

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}