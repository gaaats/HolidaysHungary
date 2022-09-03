package com.holidayscountrypackfiveee.holidayhungary.recycler
import androidx.recyclerview.widget.DiffUtil
import com.holidayscountrypackfiveee.holidayhungary.entity.HolideyItemUI

class HolidaysDiffUtill: DiffUtil.ItemCallback<HolideyItemUI>() {
    override fun areItemsTheSame(oldItem: HolideyItemUI, newItem: HolideyItemUI): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: HolideyItemUI, newItem: HolideyItemUI): Boolean {
        return oldItem == newItem
    }
}