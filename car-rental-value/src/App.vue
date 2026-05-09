<template>
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container">
        <a class="navbar-brand" href="#">🚗 CarRental</a>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item">
              <RouterLink class="nav-link" to="/">Головна</RouterLink>
            </li>
            <li class="nav-item">
              <RouterLink class="nav-link" to="/cars">Наш автопарк</RouterLink>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>

  <main class="container mt-4">
    <RouterView />
  </main>
</template>

<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>