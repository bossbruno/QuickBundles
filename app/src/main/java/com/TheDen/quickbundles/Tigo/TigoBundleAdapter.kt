package com.TheDen.quickbundles.Tigo


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


class TigoBundleAdapter(private val BundleNameList : ArrayList<BundleNames>): RecyclerView.Adapter< TigoBundleAdapter.MyViewHolder>() {
    val REQUEST_CALL_PERMISSION = 1




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.tigo_list_item,parent,false)
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
                1->{
                    val u = "tel:" + "*110%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                2->{
                    val u = "tel:" + "*703%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                3->{
                    val u = "tel:" + "*111%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                4->{
                    val u = "tel:" + "100"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                5->{
                    val u = "tel:" + "*533%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                6->{
                    val u = "tel:" + "*504%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                7->{
                    val u = "tel:" + "*100%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                8->{
                    val u = "tel:" + "*400%23"
                    val p = Intent(Intent.ACTION_CALL, u.toUri())
                    try{
                        holder.itemView.context.startActivity(p)
                    }catch (s: SecurityException) {
                        Log.e("Dial error", "$s")
                        Toast.makeText(ctx, "$s", Toast.LENGTH_LONG).show()
                    }

                }
                9->{
                    val u = "tel:" + "*589%23"
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

        val button : Button = itemView.findViewById(R.id.button_tigo)
    }

}