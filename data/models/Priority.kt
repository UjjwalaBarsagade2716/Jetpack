package com.example.myfirstcomposedemo.data.models

import androidx.compose.ui.graphics.Color
import com.example.myfirstcomposedemo.ui.theme.HighPrority
import com.example.myfirstcomposedemo.ui.theme.LowPrority
import com.example.myfirstcomposedemo.ui.theme.MediumPrority
import com.example.myfirstcomposedemo.ui.theme.NonePrority


enum class Priority (val color: Color){

    HIGH(HighPrority),
    MEDIUM(MediumPrority),
    LOW(LowPrority),
    NONE(NonePrority)
}