//package com.example.splashscreen
//
//import android.graphics.Color
//import android.location.Geocoder
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//import com.google.android.gms.maps.CameraUpdateFactory
//import com.google.android.gms.maps.GoogleMap
//import com.google.android.gms.maps.OnMapReadyCallback
//import com.google.android.gms.maps.SupportMapFragment
//import com.google.android.gms.maps.model.LatLng
//import com.google.android.gms.maps.model.MarkerOptions
//import com.example.splashscreen.databinding.ActivityMapsBinding
//import com.google.android.gms.maps.model.PolylineOptions
//
//class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
//
//    private lateinit var mMap: GoogleMap
//    private lateinit var binding: ActivityMapsBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityMapsBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        val mapFragment = supportFragmentManager
//            .findFragmentById(R.id.map) as SupportMapFragment
//        mapFragment.getMapAsync(this)
//    }
//
//    private fun getLatLngFromAddress(address: String): LatLng? {
////         Implement geocoding to get LatLng from the address
////         You can use the Google Geocoding API or other geocoding services
////         Example:
//        val geocoder = Geocoder(this)
//        val results = geocoder.getFromLocationName(address, 1)
//        if (results.isNotEmpty()) {
//            return LatLng(results[0].latitude, results[0].longitude)
//        }
//        return null
//    }
//
//
//    /**
//     * Manipulates the map once available.
//     * This callback is triggered when the map is ready to be used.
//     * This is where we can add markers or lines, add listeners or move the camera. In this case,
//     * we just add a marker near Sydney, Australia.
//     * If Google Play services is not installed on the device, the user will be prompted to install
//     * it inside the SupportMapFragment. This method will only be triggered once the user has
//     * installed Google Play services and returned to the app.
//     */
//    override fun onMapReady(googleMap: GoogleMap) {
//        mMap = googleMap
//
////        MOVING FROM ONE POINT TO ANOTHER
//        // Add a marker in source city and move the camera
//        val sc="Nairobi"
//        val sourceCity=getLatLngFromAddress(sc)
////        val beijing = LatLng(39.904202, 116.407394)
//        mMap.addMarker(MarkerOptions().position(sourceCity).title("Marker in $sc"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sourceCity))
//
//        // Add a marker in destination and move the camera
////        val ulanbator = LatLng(47.886398, 106.905746)
//        val dc="kampala"
//        val destinationCity=getLatLngFromAddress(dc)
//        mMap.addMarker(MarkerOptions().position(destinationCity).title("Marker in $dc"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(destinationCity))
//
//        val polylineOptions = PolylineOptions()
//            .add(sourceCity, destinationCity)
//            .width(5f) // Set the width of the polyline
//            .color(Color.GREEN) // Set the color of the polyline
//
//        mMap.addPolyline(polylineOptions)
//
//        // Move the camera to a suitable position
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sourceCity, 5f))
//
//
//    }
//}