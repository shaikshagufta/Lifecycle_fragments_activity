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
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("First Fragment: ", "ATTACHED TO ACTIVITY")
        //Toast.makeText(context, "FRAGMENT 1 ATTACHED TO ACTIVITY", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("First Fragment: ", "FRAGMENT CREATED")
        //Toast.makeText(context, "FRAGMENT 1 CREATED", Toast.LENGTH_SHORT).show()
    }

    //onCreateView() is the Fragment equivalent of onCreate() for Activities and runs during the View creation
    //onCreateView is used in fragment to create layout and inflate view.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Log.e("First Fragment: ", "CREATING VIEW")
        //Toast.makeText(context, "FRAGMENT 1 CREATING VIEW ", Toast.LENGTH_SHORT).show()

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    //onViewCreated() runs after the View has been created.
    //onViewCreated is used to reference the view created by onCreateView()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("First Fragment: ", "VIEW CREATED")
        //Toast.makeText(context, "FRAGMENT 1 VIEW CREATED", Toast.LENGTH_SHORT).show()

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.buttonSecondActivity.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_mainActivity2)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /*The onActivityCreated() method is now deprecated.
        Code touching the fragment's view should be done in onViewCreated() (which is called immediately before onActivityCreated()) and
        other initialization code should be in onCreate().
        To receive a callback specifically when the activity's onCreate() is complete,
        a LifeCycleObserver should be registered on the activity's Lifecycle in onAttach(),
        and removed once the onCreate() callback is received.

        override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.lifecycle?.addObserver(this)
        }

        override fun onDetach() {
        activity?.lifecycle?.removeObserver(this)
        super.onDetach()
        }*/
        Log.e("First Fragment: ", "ON ACTIVITY CREATED")
        //Toast.makeText(context, "FRAGMENT 1 ON ACTIVITY CREATED", Toast.LENGTH_SHORT).show()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("First Fragment: ", "VIEW STATE RESTORED")
        //Toast.makeText(context, "FRAGMENT 1 VIEW STATE RESTORED", Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.e("First Fragment: ", "STARTED")
        //Toast.makeText(context, "FRAGMENT 1 STARTED", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.e("First Fragment: ", "RESUMED")
        //Toast.makeText(context, "FRAGMENT 1 RESUMED", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("First Fragment: ", "PAUSED")
        //Toast.makeText(context, "FRAGMENT 1 PAUSED", Toast.LENGTH_SHORT).show()
    }

    //state is not yet saved
    override fun onStop() {
        super.onStop()
        Log.e("First Fragment: ", "STOPPED")
        //Toast.makeText(context, "FRAGMENT 1 STOPPED", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("First Fragment: ", "STATE INSTANCE SAVED")
        //Toast.makeText(context, "FRAGMENT 1 STATE INSTANCE SAVED", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("First Fragment: ", "VIEW DESTROYED")
        //Toast.makeText(context, "FRAGMENT 1 VIEW DESTROYED", Toast.LENGTH_SHORT).show()
        _binding = null

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("First Fragment: ", "DESTROYED")
        //Toast.makeText(context, "FRAGMENT 1 DESTROYED", Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("First Fragment: ", "DETACHED")
        //Toast.makeText(context, "FRAGMENT 1 DETACHED and then destroyed", Toast.LENGTH_SHORT).show()
    }
}