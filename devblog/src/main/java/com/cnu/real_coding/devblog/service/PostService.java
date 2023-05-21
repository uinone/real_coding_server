package com.cnu.real_coding.devblog.service;

import com.cnu.real_coding.common.entity.Post;
import com.cnu.real_coding.devblog.client.AdvertisementClient;
import com.cnu.real_coding.devblog.model.response.PostResponse;
import com.cnu.real_coding.devblog.repository.PostRepository;
import com.cnu.real_coding.devblog.model.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final AdvertisementClient advertisementClient;

    public Post createPost(PostRequest postRequest) {
        return postRepository.save(postRequest.toEntity());
    }

    public List<PostResponse> getPosts() {
        return postRepository.findAll()
                .stream()
                .map(post -> new PostResponse(post,
                        advertisementClient.getAd()))
                .collect(Collectors.toList());
    }

    public Optional<PostResponse> getPost(Integer postId) {
        return postRepository.findById(postId)
                .map(post -> new PostResponse(post,
                        advertisementClient.getAd()));
    }

    public Optional<Post> updatePost(Integer postId, PostRequest postRequest) {
        return postRepository.findById(postId)
                .map(post -> {
                    post.setTitle(postRequest.getTitle());
                    post.setContents(postRequest.getContents());
                    post.setTag(postRequest.getTag());
                    return postRepository.save(post);
                });
    }

    public void deletePost(Integer postId) {
        postRepository.findById(postId)
                .ifPresent(postRepository::delete);
    }
}
