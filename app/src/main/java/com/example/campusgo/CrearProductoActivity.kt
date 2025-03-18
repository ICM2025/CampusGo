package com.example.campusgo
//Creación de Producto → Formulario para publicar un producto.
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.campusgo.databinding.ActivityCrearProductoBinding

class CrearProductoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCrearProductoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
