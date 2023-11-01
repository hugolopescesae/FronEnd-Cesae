<?php $__env->startSection('content'); ?>

<div class="container container-form">
    <div class="heading">
        <a href="" class="active">Estudante</a>
        <a href="<?php echo e(route('registo-instituicao')); ?>" class="non-active">Instituição</a>
    </div>
    <div class="formulario">
        <div class="row">
            <div class="col-lg-7 form">
                <form action="">
                    <h2>Registo Estudante</h2>
                    <div class="row form-group">
                        <div class="col-md-6">
                            <div class="form-group form-input">
                                <label for="primeiroNome">Primeiro Nome</label>
                                <input type="text" class="form-control" id="primeiroNome" name="primeiroNome" placeholder="Primeiro nome" required>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group form-input">
                                <label for="ultimoNome">Último Nome</label>
                                <input type="text" class="form-control" id="ultimoNome" name="ultimoNome" placeholder="Último nome" required>
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group form-margin">
                        <label>Género</label>
                        <div class="form-radio">
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="generoFeminino" name="genero" value="Feminino">
                                <label class="form-check-label" for="generoFeminino" style="
                                font-weight: 500;">Feminino</label>
                            </div>
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="generoMasculino" name="genero" value="Masculino">
                                <label class="form-check-label" for="generoMasculino" style="
                                font-weight: 500;">Masculino</label>
                            </div>
                            <div class="form-check">
                                <input type="radio" class="form-check-input" id="generoOutro" name="genero" value="Outro">
                                <label class="form-check-label" for="generoOutro" style="
                                font-weight: 500;">Outro</label>
                            </div>
                        </div>
                    </div>

                    <div class="row form-group">
                        <div class="col-md-12">
                            <div class="form-group form-input">
                                <label for="distrito">Distrito</label>
                                <input type="text" class="form-control" id="distrito" name="distrito" placeholder="Distrito" required>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group form-input">
                                <label for="concelho">Concelho</label>
                                <input type="text" class="form-control" id="concelho" name="concelho" placeholder="Concelho" required>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group form-input">
                                <label for="freguesia">Freguesia</label>
                                <input type="text" class="form-control" id="freguesia" name="freguesia" placeholder="Freguesia" required>
                            </div>
                        </div>
                    </div>

                    <br>
                    <div class="form-group form-margin form-input">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="Email" required>
                    </div>

                    <div class="form-group form-margin form-input">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                    </div>

                    <div class="form-group form-margin form-input">
                        <label for="confirmarPassword">Confirmar Password</label>
                        <input type="password" class="form-control" id="confirmarPassword" name="confirmarPassword" placeholder="Confirmar password" required>
                    </div>

                    <br>
                    <div class="form-check form-group form-margin termos">
                        <input type="checkbox" class="form-check-input" id="aceitarTermos" name="aceitarTermos" required>
                        <label class="form-check-label" for="aceitarTermos">Aceito os termos e condições</label>
                    </div>

                    <button class="button-link form-margin">Submeter</button>
                </form>
            </div>
            <div class="col-lg-5 section">
                <h3>Já se encontra registado?</h3>
                <a class="button-link" href="<?php echo e(route('login')); ?>">Faça o login</a>
            </div>
        </div>
    </div>
</div>

   
        
<?php $__env->stopSection(); ?>



<?php echo $__env->make('layouts.main_layout', \Illuminate\Support\Arr::except(get_defined_vars(), ['__data', '__path']))->render(); ?><?php /**PATH C:\Users\hugol\Desktop\Programação\FrontEnd-Cesae\Projeto\project\resources\views/registo-estudante.blade.php ENDPATH**/ ?>