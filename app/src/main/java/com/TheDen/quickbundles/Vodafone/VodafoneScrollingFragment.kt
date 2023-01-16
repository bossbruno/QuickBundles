package com.TheDen.quickbundles.Vodafone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.TheDen.quickbundles.BundleNames
import com.TheDen.quickbundles.MTN.MtnbundleAdapter
import com.TheDen.quickbundles.R

class VodafoneScrollingFragment : Fragment() {
    private lateinit var adapter: VoadafoneBundleAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var BundleNamesList :ArrayList<BundleNames>

    lateinit var bundleNames: Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tigo_scrolling, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_view_tigo)
        recyclerView.layoutManager = layoutManager
        adapter= VoadafoneBundleAdapter(BundleNamesList)
        recyclerView.adapter= adapter
    }


    private  fun dataInitialize(){
        BundleNamesList = arrayListOf<BundleNames>()
        bundleNames= arrayOf(
            "VODAFONE INFORMATION SERVICE \n*151#",
            "VODAFONE CHECK CREDIT BALANCE\n *124#",
            "VODAFONE CASH\n *110#",
            "CHECK YOUR NUMBER\n *127#",
            "CHECK BUNDLE BALANCE\n *126# ",
            "VODAFONE RED \n *200#",
            "VODAFONE INTERNET PACKAGES\n *700#",
            "VODAFONE MADE FOR ME\n *530#"

        )
        for (i in bundleNames.indices){
            val bundle = BundleNames(bundleNames[i])
            BundleNamesList.add(bundle)

        }

    }
}