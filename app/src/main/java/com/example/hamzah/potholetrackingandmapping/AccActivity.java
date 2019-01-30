package com.example.hamzah.potholetrackingandmapping;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.ComponentCallbacks2;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.KeyEventDispatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

interface AccActivity extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener, ComponentCallbacks2, LifecycleOwner, KeyEventDispatcher.Component, ViewModelStoreOwner, ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator, OnMapReadyCallback, LocationListener {
    @Override
    void onMapReady(GoogleMap googleMap);

    @Override
    void onLocationChanged(Location location);

    @Override
    void onStatusChanged(String s, int i, Bundle bundle);

    @Override
    void onProviderEnabled(String s);

    @Override
    void onProviderDisabled(String s);

    void onAccuracyChanged(Sensor sensor, int accuracy);

    void onSensorChanged(SensorEvent event);
}
