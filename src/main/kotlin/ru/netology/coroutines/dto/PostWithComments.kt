package ru.netology.coroutines.dto

data class PostWithCommentsAndAuthor(
    val post: Post,
    val comments: List<CommentWithAuthor>,
    val author:Author
)
