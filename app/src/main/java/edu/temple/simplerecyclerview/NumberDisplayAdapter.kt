package edu.temple.simplerecyclerview

import android.renderscript.Type
import android.view.ViewParent
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val items: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = NumberViewHolder (
        TextView(parent.context).apply {
            setPadding(10,10,10,10)
        }
    )

        override fun onBindViewHolder(
            holder: NumberViewHolder,
            position: Int) {

            with (holder.textView){
                text = items[position].toString()
                textSize = items[position].toFloat()
            }

        }

        override fun getItemCount(): Int = items.size

}


