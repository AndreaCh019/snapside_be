package com.unisalento.snapside.adapters;

import com.unisalento.snapside.generated.domain.CommentEntity;
import com.unisalento.snapside.models.CommentDTO;

public class CommentAdapter {
    public static CommentEntity CommentDTOToCommentEntity(CommentDTO commentDTO) {
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setText(commentDTO.getText());
        commentEntity.setRating(commentDTO.getRating());
        return commentEntity;
    }

    public static CommentDTO CommentEntityToCommentDTO(CommentEntity commentEntity) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setText(commentEntity.getText());
        commentDTO.setRating(commentEntity.getRating());
        return commentDTO;
    }
}
