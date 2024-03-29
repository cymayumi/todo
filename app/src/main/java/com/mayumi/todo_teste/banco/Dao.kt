package com.mayumi.todo_teste.banco

import android.content.Context
import android.database.sqlite.SQLiteDatabase

open class Dao (
    private val context: Context
) {

    protected var db: SQLiteDatabase? = null

    fun abrirBanco() {
        val helper = SQLiteHelper(
            context,
            Constantes.BANCO,
            null,
            Constantes.VERSAO
        )
        this.db = helper.writableDatabase
    }

    fun fecharBanco() {
        if (db != null) {
            db?.close()
        }
    }
}