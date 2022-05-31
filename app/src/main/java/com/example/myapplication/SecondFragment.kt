package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Second Fragment: ", "ATTACHED TO ACTIVITY" )
        //Toast.makeText(context, "FRAGMENT 2 ATTACHED TO ACTIVITY", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Second Fragment: ", "FRAGMENT CREATED" )
        //Toast.makeText(context, "FRAGMENT 2 CREATED",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.e("Second Fragment: ", "CREATING VIEW" )
        //Toast.makeText(context, "FRAGMENT 2 CREATING VIEW ",Toast.LENGTH_SHORT).show()

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("Second Fragment: ", "VIEW CREATED" )
        //Toast.makeText(context, "FRAGMENT 2 VIEW CREATED",Toast.LENGTH_SHORT).show()

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("Second Fragment: ", "ON ACTIVITY CREATED" )
        //Toast.makeText(context, "FRAGMENT 2 ON ACTIVITY CREATED" ,Toast.LENGTH_SHORT).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("Second Fragment: ", "VIEW STATE RESTORED" )
        //Toast.makeText(context, "FRAGMENT 2 VIEW STATE RESTORED" ,Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e("Second Fragment: ", "STARTED" )
        //Toast.makeText(context, "FRAGMENT 2 STARTED" ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.e("Second Fragment: ", "RESUMED" )
        //Toast.makeText(context, "FRAGMENT 2 RESUMED",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("Second Fragment: ", "PAUSED" )
        //Toast.makeText(context, "FRAGMENT 2 PAUSED",Toast.LENGTH_SHORT).show()
    }

    //state is not yet saved
    override fun onStop() {
        super.onStop()
        Log.e("Second Fragment: ", "STOPPED" )
        //Toast.makeText(context, "FRAGMENT 2 STOPPED",Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("Second Fragment: ", "STATE INSTANCE SAVED" )
        //Toast.makeText(context, "FRAGMENT 2 STATE INSTANCE SAVED",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Second Fragment: ", "VIEW DESTROYED" )
        //Toast.makeText(context, "FRAGMENT 2 VIEW DESTROYED",Toast.LENGTH_SHORT).show()
        _binding = null

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Second Fragment: ", "DESTROYED" )
        //Toast.makeText(context, "FRAGMENT 2 DESTROYED",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Second Fragment: ", "DETACHED" )
        //Toast.makeText(context, "FRAGMENT 2 DETACHED and then destroyed",Toast.LENGTH_SHORT).show()
    }
}