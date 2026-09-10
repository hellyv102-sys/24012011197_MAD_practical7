package com.example.a24012011197_mad_practical7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(
    private val personList: ArrayList<Person>
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.txtName)
        val phone: TextView = itemView.findViewById(R.id.txtPhone)
        val email: TextView = itemView.findViewById(R.id.txtEmail)
        val address: TextView = itemView.findViewById(R.id.txtAddress)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_item, parent, false)

        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: PersonViewHolder,
        position: Int
    ) {
        val person = personList[position]

        holder.name.text = person.name
        holder.phone.text = person.phoneNO
        holder.email.text = person.emailid
        holder.address.text = person.address
    }

    override fun getItemCount(): Int {
        return personList.size
    }
}