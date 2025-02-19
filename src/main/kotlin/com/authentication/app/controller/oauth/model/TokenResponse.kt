package com.authentication.app.controller.oauth.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by Jefry Jacky on 13/09/20.
 */
data class TokenResponse(
        @JsonProperty("access_token")
        val accessToken: String,
        @JsonIgnore
        val refreshToken: String,
        @JsonProperty("expired_date")
        val expiredDate: Long
)