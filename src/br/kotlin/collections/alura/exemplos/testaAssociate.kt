package br.kotlin.collections.alura.exemplos


fun testaAssociate() {
    val pedidos: List<Pedido> = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 50.0),
        Pedido(5, 60.0),
        Pedido(6, 70.0)
    )

    println(pedidos)
    val pedidosAssociados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosAssociados)
    println(pedidosAssociados[1])

    val pedidoFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor >= 50.0 }
    println(pedidoFreteGratis)

    val associateBy: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor >= 50.0 }
    println(associateBy)

    val pedidosAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido -> pedido.valor > 50 }
    println(pedidosAgrupados)
}


data class Pedido(val numero:Int, val valor:Double)