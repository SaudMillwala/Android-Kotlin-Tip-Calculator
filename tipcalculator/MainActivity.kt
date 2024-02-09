package com.example.tipcalculator

import android.graphics.Color
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculateTip(view: View): Unit {

        var buttonPressed: Button = view as Button
        var inputAmount: TextView = findViewById(R.id.InputAmountID)
        var inputNum = inputAmount.text.toString().toDouble()
        var totalAmount = 0
        var tipTotal:Double = 0.00

        if (buttonPressed.id.equals(R.id.TipBtn15)) {

            var calcmath = CalcMath(billWithoutTip = inputNum)
            var fifteentip:Double = calcmath.TipFifteen
            var tipTotal: TextView = findViewById(R.id.TipView)
            tipTotal.text = "$fifteentip"
        }
        if (buttonPressed.id.equals(R.id.TipBtn20)) {

            var calcmath = CalcMath(billWithoutTip = inputNum)
            var twentytip:Double = calcmath.TipTwenty
            var tipTotal: TextView = findViewById(R.id.TipView)
            tipTotal.text = "$twentytip"
        }
        if (buttonPressed.id.equals(R.id.TipBtn25)) {

            var calcmath = CalcMath(billWithoutTip = inputNum)
            var twentyfivetip:Double = calcmath.TipTwentyFive
            var tipTotal: TextView = findViewById(R.id.TipView)
            tipTotal.text = "$twentyfivetip"
        }
        if (buttonPressed.id.equals(R.id.CustomTipBtn)) {
            var CustomInputTip: TextView = findViewById(R.id.CustomTipID)
            var DoubleCustomTipID = CustomInputTip.text.toString().toDouble()
            var customTipAmounts= CustomTip(customTipPercent = DoubleCustomTipID,billWithoutTip = inputNum)
            var tipTotal: TextView = findViewById(R.id.TipView)
            tipTotal.text = "${customTipAmounts.customTipTotal}"
        }
        if (buttonPressed.id.equals(R.id.CalculateBtn)) {

            var inputTip: TextView = findViewById(R.id.TipView)
            var DoubleTip = inputTip.text.toString().toDouble()
            var calculatetotal = CalculateTotal(billWithoutTip = inputNum, TotalTip = DoubleTip)
            var finaltotal = calculatetotal.finaltotal
            var Total: TextView = findViewById(R.id.totalView)
            Total.text = "$finaltotal"
        }
    }
    }









