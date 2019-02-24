# Lazy Miner
![LazyMiner Logo](https://user-images.githubusercontent.com/8284677/53295699-044c3b80-37f9-11e9-8410-fc02ee7004a5.jpg)
The Lazyminer project, Non-Axiomatic Reasoning for rule mining on mobile devices.
Publication: 

http://cadia.ru.is/workshops/aegap2018/papers/AEGAP_2018_Hammer.pdf

A full example project including sources and a compiled app can be downloaded at:

https://drive.google.com/drive/folders/0B8Z4Yige07tBRVE2OGRWRVpPYW8?usp=sharing

LazyMiner.java is a wrapper for OpenNARS allowing for proper Narsese encoding of sensory values and usage of its QA API.
PatientSimulator.java is one example of how LazyMiner can be used, simulating a patient's daily routine, providing information to OpenNARS as events that also the Android API's provide.

Discussion
----------
https://groups.google.com/forum/?nomobile=true#!searchin/open-nars/lazyminer%7Csort:date/open-nars/B-IjA4uQ8wE/EVviAolxAwAJ

Why isn't the Android project open-sourced?
-------------------------------------------
To my experience Android has short-lived API, which is why only the relevant sources were added and not the Android project itself. I always seemed a lot easier to integrate sources in a fresh Android project than to compile one for a previous Android version, it's a versioning mess not seen elsewhere and Android studio a terrible resource hog.
