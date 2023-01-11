package com.TheDen.quickbundles.MTN

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.TheDen.quickbundles.BundleNames
import com.TheDen.quickbundles.R

class MtnScrollingFragment : Fragment() {
    private lateinit var adapter: MtnbundleAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var BundleNamesList :ArrayList<BundleNames>

    lateinit var bundleNames: Array<String>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_mtn_scrolling, container, false)




    }

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
            "MTN PULSE \n *567#"


                )
for (i in bundleNames.indices){
    val bundle = BundleNames(bundleNames[i])
    BundleNamesList.add(bundle)



}

    }
}