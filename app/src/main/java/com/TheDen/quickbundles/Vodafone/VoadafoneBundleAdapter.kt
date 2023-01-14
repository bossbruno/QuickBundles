package com.TheDen.quickbundles.Vodafone


import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.TheDen.quickbundles.BundleNames
import com.TheDen.quickbundles.R


class VoadafoneBundleAdapter(private val BundleNameList : ArrayList<BundleNames>): RecyclerView.Adapter< VoadafoneBundleAdapter.MyViewHolder>() {
    val REQUEST_CALL_PERMISSION = 1




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.vodafone_list_item,parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        val currentItem = BundleNameList[position]
        val ctx = holder.itemView.context
        holder.button.text = currentItem.bundleNames

        holder.button.setOnClickListener{
            val clickedbutton = holder.adapterPosition
            when(clickedbutton){

                0->{
                    val u = "tel:" + "*151%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                1 ->{
                    val u = "tel:" + "*124%23"
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
                2->{
                    val u = "tel:" + "*110%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                3->{
                    val u = "tel:" + "*127%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                4->{
                    val u = "tel:" + "*126%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                5->{
                    val u = "tel:" + "*200%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                6->{
                val u = "tel:" + "*530%23"
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

        val button : Button = itemView.findViewById(R.id.button_vodafone)
    }

}