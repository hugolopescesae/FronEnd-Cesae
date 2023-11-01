<nav class="navbar sticky-top navbar-expand-lg">
    <div class="container-fluid">
      <div class="links-registration-992">
        <button class="btn-link btn-user" type="submit">
            <i class="fas fa-user"></i>
        </button>
        <button class="btn-link btn-user" type="submit">
            <i class="fas fa-sign-in-alt"></i>
        </button>
      </div>
        <a class="navbar-brand" href="<?php echo e(route('home')); ?>">
            <img src="<?php echo e(asset('images/logo.png')); ?>" alt="Logo" class="d-inline-block align-text-top">
        </a>
        <button class="navbar-toggler order-first" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" id="navbarLinks">
                <li class="nav-item">
                    <a class="navlink link-active" aria-current="page" href="<?php echo e(route('home')); ?>">Home <i
                            class="fas fa-home"></i></a>
                </li>
                <li class="nav-item">
                    <a class="navlink" href="<?php echo e(route('sobre-nos')); ?>">Sobre nós</a>
                </li>
                <?php if(session()->has('email')): ?>
                <li class="nav-item">
                    <a class="navlink" href="<?php echo e(route('teste-vocacional-intro')); ?>">Teste vocacional</a>
                </li>
                <?php endif; ?>
                <li class="nav-item">
                    <a class="navlink" href="<?php echo e(route('contactos')); ?>">Contactos</a>
                </li>
            </ul>
          </div>
        </div>
    </div>
    <div class="links-registration">
        <?php if(!session()->has('email')): ?>
            <a class="btn-link btn-user" href="<?php echo e(route('login')); ?>">
                <i class="fas fa-user"><span class="mx-1">Login</span></i>
            </a>
            <a class="btn-link btn-user" href="<?php echo e(route('registo-estudante')); ?>">
                <i class="fas fa-sign-in-alt"><span class="mx-1">Registar</span></i>
            </a>
        <?php else: ?>
            <a class="btn-link btn-user" href="<?php echo e(route('login')); ?>">
                <i class="fas fa-user"><span class="mx-1"><?php echo e(session()->get('primeiroNome')); ?></span></i>
            </a>
            <a class="btn-link btn-user" href="<?php echo e(route('logout')); ?>">
                <i class="fa-solid fa-right-from-bracket"><span class="mx-1">Logout</span></i>
            </a>
         <?php endif; ?>
        
    </div>
</nav><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/components/master/navbar.blade.php ENDPATH**/ ?>