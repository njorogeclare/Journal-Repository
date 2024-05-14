package com.example.myproject.models

class Upload{
    var write:String=""
    var imageUrl:String=""
    var id:String=""

    constructor(paragraph:String,imageUrl:String,id:String){

        this.write=paragraph
        this.imageUrl=imageUrl
        this.id=id

    }
    constructor()
}