package com.unisalento.snapside.iservices;

import com.unisalento.snapside.exceptions.CommentNotFoundException;
import com.unisalento.snapside.generated.domain.CommentEntity;
import java.util.List;

public interface ICommentService {
    public List<CommentEntity> getAll() throws CommentNotFoundException;
    public CommentEntity getById(int id) throws CommentNotFoundException;
}
