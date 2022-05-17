package com.example.myfirstcomposedemo.ui.Screens.List;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\t\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a8\u0010\u0011\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0016\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001aF\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a8\u0006\u0019"}, d2 = {"DefaultListAppBar", "", "onSearchClicked", "Lkotlin/Function0;", "onSortClicked", "Lkotlin/Function1;", "Lcom/example/myfirstcomposedemo/data/models/Priority;", "onDeleteClicked", "DefaultListAppBarPreview", "DeleteAllAction", "ListAppBar", "sharedViewModel", "Lcom/example/myfirstcomposedemo/ui/viewmodels/SharedViewModel;", "searchAppBarState", "Lcom/example/myfirstcomposedemo/Util/SearchAppBarState;", "searchTextState", "", "ListAppBarActions", "SearchAction", "SearchAppBAr", "text", "onTextChange", "onClosedClick", "SearchAppBarPreview", "SortAction", "app_debug"})
public final class ListAppBarKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ListAppBar(@org.jetbrains.annotations.NotNull()
    com.example.myfirstcomposedemo.ui.viewmodels.SharedViewModel sharedViewModel, @org.jetbrains.annotations.NotNull()
    com.example.myfirstcomposedemo.Util.SearchAppBarState searchAppBarState, @org.jetbrains.annotations.NotNull()
    java.lang.String searchTextState) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DefaultListAppBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.myfirstcomposedemo.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ListAppBarActions(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.myfirstcomposedemo.data.models.Priority, kotlin.Unit> onSortClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SortAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.myfirstcomposedemo.data.models.Priority, kotlin.Unit> onSortClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DeleteAllAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchAppBAr(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClosedClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchClicked) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void DefaultListAppBarPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void SearchAppBarPreview() {
    }
}