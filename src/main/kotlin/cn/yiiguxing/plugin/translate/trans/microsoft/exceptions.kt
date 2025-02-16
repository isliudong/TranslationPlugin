@file:Suppress("unused")

package cn.yiiguxing.plugin.translate.trans.microsoft

import cn.yiiguxing.plugin.translate.trans.microsoft.data.MicrosoftErrorMessage
import java.io.IOException

class MicrosoftAuthenticationException(
    message: String? = null,
    cause: Throwable? = null
) : IOException(message, cause)

class MicrosoftStatusCodeException(
    message: String?,
    val error: MicrosoftErrorMessage?,
    val statusCode: Int
) : IOException(message) {
    constructor(message: String?, statusCode: Int) : this(message, null, statusCode)
}