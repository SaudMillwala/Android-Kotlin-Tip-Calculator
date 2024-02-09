package com.example.tipcalculator

import android.view.View
import android.widget.TextView

class CalcMath  (var billWithoutTip:Double) {


    var TipFifteen: Double = billWithoutTip * 0.15
    var TipTwenty:Double = billWithoutTip * 0.20
    var TipTwentyFive: Double = billWithoutTip * 0.25
}

    class CustomTip(var customTipPercent:Double, var billWithoutTip:Double) {

            var customTipAmount = customTipPercent


            var customTipTotal = customTipAmount

        }

    class CalculateTotal(var billWithoutTip: Double, var TotalTip: Double) {


            var finaltotal:Double = TotalTip + billWithoutTip

        }

