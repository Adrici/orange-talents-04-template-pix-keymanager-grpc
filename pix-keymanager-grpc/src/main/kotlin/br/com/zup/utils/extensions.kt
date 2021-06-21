package br.com.zup.utils

import br.com.zup.RegistraChavePixRequest
import br.com.zup.TipoDeChave.*
import br.com.zup.TipoDeConta
import br.com.zup.TipoDeConta.*
import br.com.zup.chave.NovaChavePix
import br.com.zup.registra.TipoDeChave


fun RegistraChavePixRequest.toModel(): NovaChavePix {
    return NovaChavePix(
        clienteId = clientId,
        tipoDeChave = when(tipoDeChave){
            UNKNOWN_TIPO_CHAVE -> null
            else -> TipoDeChave.valueOf(tipoDeChave.name)
        },
        chave = chave,
        tipoDeConta = when(tipoDeConta){
            UNKNOWN_TIPO_CONTA -> null
            else -> TipoDeConta.valueOf(tipoDeConta.name)
        }
    )
}