package rubbish


class Stack <T>{

    private var top : Linked<T>? = null

    fun push(e:T) {top = Linked(e, top)
    }

    fun get():T?{
        val value = top?.value
        top = top?.next
        return value
    }

    fun see()=top?.value

}