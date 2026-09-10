package com.example.a24012011197_mad_practical7

import java.io.Serializable

class Person(
    var id: String,
    var name: String,
    var emailid: String,
    var phoneNO: String,
    var address: String,
    var latitude: Double,
    var longitude: Double
) : Serializable