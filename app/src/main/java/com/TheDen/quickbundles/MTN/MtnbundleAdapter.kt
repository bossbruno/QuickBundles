package com.TheDen.quickbundles.MTN

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.TheDen.quickbundles.BundleNames
import com.TheDen.quickbundles.R
import com.TheDen.quickbundles.ScreenSlidePagerActivity

class MtnbundleAdapter(private val BundleNameList : ArrayList<BundleNames>): RecyclerView.Adapter< MtnbundleAdapter.MyViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView= LayoutInflater.from(parent.context).inflate(R.layout.mtn_list_item,parent,false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
 val currentItem = BundleNameList[position]
        val ctx = holder.itemView.context
        holder.button.text = currentItem.bundleNames

        holder.button.setOnClickListener{
       val clickedbutton = holder.adapterPosition
            when(clickedbutton){
                0 ->{
                    val u = "tel:" + "*135*2*1%23"
                    // Create the intent and set the data for the
                    // intent as the phone number.
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
              try {
                    // Launch the Phone app's dialer with a phone
                    // number to dial a call.
                    ctx.startActivity(p)
                    }
              catch (s: SecurityException)
                    {
                     Log.e("Dial error", "$s")
                     // show() method display the toast with
                     // exception message.
                     Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
  }
                }

                1->{
                    val u = "tel:" + "*170%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                2->{
                    val u = "tel:" + "*124%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
            }



        }

    }

    override fun getItemCount(): Int {
      return BundleNameList.size
    }


    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

val button : Button = itemView.findViewById(R.id.button)
    }

}