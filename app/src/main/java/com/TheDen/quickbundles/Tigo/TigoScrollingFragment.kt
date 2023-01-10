package com.TheDen.quickbundles.Tigo

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

class TigoScrollingFragment : Fragment() {
    private lateinit var adapter: TigoBundleAdapter
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
        adapter= TigoBundleAdapter(BundleNamesList)
        recyclerView.adapter= adapter
    }


    private  fun dataInitialize(){
        BundleNamesList = arrayListOf<BundleNames>()
        bundleNames= arrayOf(
            "TIGO CHECK BALANCE",
            "TIGO CASH",
            "CHECK YOUR NUMBER"

        )
        for (i in bundleNames.indices){
            val bundle = BundleNames(bundleNames[i])
            BundleNamesList.add(bundle)

        }

    }
}