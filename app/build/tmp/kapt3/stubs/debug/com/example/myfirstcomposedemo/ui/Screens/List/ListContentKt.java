package com.example.myfirstcomposedemo.ui.Screens.List;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a?\u0010\u000b\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0007\u00a8\u0006\u0010"}, d2 = {"DisplayTask", "", "task", "", "Lcom/example/myfirstcomposedemo/data/models/ToDoTask;", "navigateToTaskScreen", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "taskId", "ListContent", "Lcom/example/myfirstcomposedemo/Util/RequestState;", "TaskItem", "toDoTask", "taskItemPreview", "app_debug"})
public final class ListContentKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void ListContent(@org.jetbrains.annotations.NotNull()
    com.example.myfirstcomposedemo.Util.RequestState<? extends java.util.List<com.example.myfirstcomposedemo.data.models.ToDoTask>> task, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DisplayTask(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myfirstcomposedemo.data.models.ToDoTask> task, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void TaskItem(@org.jetbrains.annotations.NotNull()
    com.example.myfirstcomposedemo.data.models.ToDoTask toDoTask, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> navigateToTaskScreen) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void taskItemPreview() {
    }
}