package com.authentication.app.domain.entity

/**
 * Created by Jefry Jacky on 06/09/20.
 */
data class RefreshToken(
        val userId: Long,
        val refreshToken: String
)