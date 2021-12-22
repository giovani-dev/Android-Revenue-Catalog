package com.giovani.androidrevenuecatalog.restaurant

class Restaurant {

    fun getAll(): MutableList<RestaurantData> {
        return mutableListOf(
            RestaurantData(image = "https://t.ctcdn.com.br/8FplhVkDQdAatiUcehCimgkGJlI=/512x288/smart/i257652.jpeg", name = "Paco Nordestino", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
            RestaurantData(image = "https://www.hypeness.com.br/1/2018/12/imagens-surreais.jpg", name = "Russia em lata", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
            RestaurantData(image = "https://meunegocio.uol.com.br/blog/wp-content/uploads/2020/04/banco-imagens.jpg", name = "Isqueiro Flamejante", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
            RestaurantData(image = "https://media.istockphoto.com/photos/rio-de-janeiro-aerial-picture-id534215078?k=20&m=534215078&s=612x612&w=0&h=m_f-fdLvL5w4IWPMBckpOD8TQVweNnVXkhlbHTIwYjo=", name = "Sabor do Dia", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
            RestaurantData(image = "https://source.unsplash.com/random", name = "Prato de Cera", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
            RestaurantData(image = "https://source.unsplash.com/random", name = "Colher de Sabao", address = "Rua do XXXX, numero 10", openingHours = "Abre as 09:30 - Fecha as 23:45"),
        )
    }
}