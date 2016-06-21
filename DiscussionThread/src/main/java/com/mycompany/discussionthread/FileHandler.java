/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.discussionthread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Logan
 */
public class FileHandler implements CommentHandler {

    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void addComment(Comment comment) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));

            writer.write(comment.toFileString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Comment> getComments() {
        List<Comment> list = new ArrayList<>();
        Comment plzwork = new Comment("Plz Work","Today","steve");
        list.add(plzwork);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFileName()));
            String line;

            while ((line = reader.readLine()) != null) {
                Comment comment = new Comment();

                comment.loadFromFileString(line);
                list.add(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
