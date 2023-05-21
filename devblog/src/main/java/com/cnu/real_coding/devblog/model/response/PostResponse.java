package com.cnu.real_coding.devblog.model.response;


import com.cnu.real_coding.common.entity.Advertisement;
import com.cnu.real_coding.common.entity.Post;

public record PostResponse(
        Post post,
        Advertisement advertisement
) {
}
