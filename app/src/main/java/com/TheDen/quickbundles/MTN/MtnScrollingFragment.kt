package com.TheDen.quickbundles.MTN

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.TheDen.quickbundles.BundleNames
import com.TheDen.quickbundles.R

class MtnScrollingFragment : Fragment() {
    private lateinit var adapter: MtnbundleAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var BundleNamesList :ArrayList<BundleNames>
    val BUTTONSTATE = "BUTTON_STATE"
    private val NOTFAV = "Notfavourite"
    private val FAV = "Favourite"
    private var button_state = "Notfavourite"
    val favbutton : Button? = view?.findViewById(R.id.mtn_favbutton)
    lateinit var bundleNames: Array<String>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

//        if (savedInstanceState !=null){
//            button_state = savedInstanceState.getString(BUTTONSTATE, "Notfavourite")
//        }

        return inflater.inflate(R.layout.fragment_mtn_scrolling, container, false)




    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        outState.putString(BUTTONSTATE, button_state)
//        super.onSaveInstanceState(outState)
//    }

//     fun Clickfav(){
//        when (button_state){
//            NOTFAV->{
//                button_state = FAV
//            }
//
//            FAV -> {
//                button_state=NOTFAV
//            }
//
//        }
//        setfavButton()
//    }
//
//    fun setfavButton() {
//
//      if (button_state == FAV)
//      {
//          favbutton?.setBackgroundResource(R.drawable.ic_baseline_star_24)
//
//        }
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = layoutManager
        adapter= MtnbundleAdapter(BundleNamesList)
        recyclerView.adapter= adapter




    }


    private  fun dataInitialize(){
        BundleNamesList = arrayListOf<BundleNames>()
        bundleNames= arrayOf(
                "MTN ZONE bundles\n *135*2*1#",
            "MTN ZONE CHECK BALANCE\n *135*2*2#",
            "MTN MOBILE MONEY\n *170#",
            "MTN CHECK BALANCE \n*124#",
            "MTN PULSE \n *567#",
            "CHECK YOUR SUBSCRIPTIONS\n *175#",
            "check if number is registered\n *400#"


                )
for (i in bundleNames.indices){
    val bundle = BundleNames(bundleNames[i])
    BundleNamesList.add(bundle)



}

    }
}